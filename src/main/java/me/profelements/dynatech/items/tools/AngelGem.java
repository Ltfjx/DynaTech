package me.profelements.dynatech.items.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.apache.commons.lang.Validate;
import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemDropHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class AngelGem extends SlimefunItem {

    private float flySpeed = 0.1f;
    private boolean flightEnabled = false;

    public AngelGem(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        addItemHandler(onRightClick(), onItemDrop());
    }

    private ItemDropHandler onItemDrop() {
        return new ItemDropHandler() {

            @Override
            public boolean onItemDrop(PlayerDropItemEvent e, Player p, Item item) {
                p.setFlying(false);
                p.setAllowFlight(false);
                p.setFlySpeed(0.1f);
                p.setFallDistance(0.0f);
                return true;
            }

        };
    }

    private ItemUseHandler onRightClick() {
        return new ItemUseHandler() {
            @Override
            public void onRightClick(PlayerRightClickEvent e) {
                if (e.getPlayer().isSneaking() && e.getPlayer().getAllowFlight()) {
                    e.getPlayer().setFlying(false);
                    e.getPlayer().setAllowFlight(false);
                    e.getPlayer().setFallDistance(0f);
                    e.getItem().setItemMeta(updateLore(e.getItem(), e.getPlayer()));
                }
                if (!e.getPlayer().getAllowFlight()) {
                    e.getPlayer().setAllowFlight(true);
                    setFlySpeed(0.10f);
                    e.getPlayer().setFlySpeed(getFlySpeed());
                    e.getItem().setItemMeta(updateLore(e.getItem(), e.getPlayer()));
                } else {
                    if (getFlySpeed() < 1f) {
                        setFlySpeed(getFlySpeed() + 0.10f);
                        e.getPlayer().setFlySpeed(getFlySpeed());
                        e.getItem().setItemMeta(updateLore(e.getItem(), e.getPlayer()));
                    } else {
                        setFlySpeed(0.10f);
                        e.getPlayer().setFlySpeed(getFlySpeed());
                        e.getItem().setItemMeta(updateLore(e.getItem(), e.getPlayer()));
                    }
                }
                e.cancel();
            }   
        };
    }

    protected ItemMeta updateLore(ItemStack item, Player p) {
        ItemMeta im = item.getItemMeta();

        if (!im.hasLore()) {
            throw new IllegalArgumentException("This item does not have any lore!");
        }

        List<String> lore = im.getLore();

        for (int line = 0; line < lore.size(); line++ ) {
            if (lore.get(line).contains("飛行: <enabled>")) {
                lore.set(line, lore.get(line).replace("<enabled>", p.getAllowFlight() ? "啟動" : "關閉"));
            }
            if (lore.get(line).contains(ChatColor.GRAY + "飛行速度: ")) {
                lore.set(line, lore.get(line).replaceFirst(".*", ChatColor.GRAY + "飛行速度: " + getFlySpeed()));
            }
        }

        im.setLore(lore);
        return im;
    }


    public float getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(float newFlySpeed) {
        Validate.isTrue(newFlySpeed > 0, "Must be greater then 0");

        BigDecimal bd = new BigDecimal(Float.toString(newFlySpeed));
        bd = bd.setScale(1, RoundingMode.DOWN);
        flySpeed = bd.floatValue();
    }

}
