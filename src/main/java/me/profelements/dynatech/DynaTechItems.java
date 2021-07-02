package me.profelements.dynatech;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DynaTechItems {

    private DynaTechItems() {}
    
    //Categories
    public static final MultiCategory DT_GENERAL = new MultiCategory(new NamespacedKey(DynaTech.getInstance(), "DT_GENERAL"), new CustomItem(Material.CONDUIT, "&b动力科技"));
    public static final SubCategory DT_RESOURCES = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_RESOURCES"), DT_GENERAL, new CustomItem(Material.PUFFERFISH, "&b动力科技 资源"));
    public static final SubCategory DT_TOOLS = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_TOOLS"), DT_GENERAL, new CustomItem(Material.DIAMOND_AXE, "&b动力科技 工具"));
    public static final SubCategory DT_MACHINES = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_MACHINES"), DT_GENERAL, new CustomItem(Material.SEA_LANTERN, "&b动力科技 机器"));
    public static final SubCategory DT_GENERATORS = new SubCategory(new NamespacedKey(DynaTech.getInstance(), "DT_GENERATORS"), DT_GENERAL, new CustomItem(Material.PRISMARINE_BRICKS, "&b动力科技 发电机"));

    public static final Category DynaTechGeneral = new Category(new NamespacedKey(DynaTech.getInstance(), "dynatech"),
        new CustomItem(Material.CONDUIT, "&b动力科技")
    );

    public static final RecipeType DynaTechScoop = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_scoop"),
        new CustomItem(Material.IRON_SHOVEL, "&b使用勺子铲蜜蜂")
    );


    //RecipeTypes
    // #TODO: Make Orechid use RecipeType + Standard Conversions
    public static final RecipeType DT_SCOOP = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "DT_SCOOP"), new CustomItem(Material.IRON_SHOVEL, "&b使用勺子铲蜜蜂"));
    //public static final RecipeType DT_ORECHID = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "DT_ORECHID"), new CustomItem(Material.END_ROD, "&BTransmuted using the Orechid"));

    //General

    //Resources
    public static final SlimefunItemStack STAINLESS_STEEL = new SlimefunItemStack("STAINLESS_STEEL", Material.IRON_INGOT, "&6不锈钢锭");
    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR = new SlimefunItemStack("STAINLESS_STEEL_ROTOR", Material.IRON_BLOCK, "&6不锈钢转子");
    public static final SlimefunItemStack ANCIENT_MACHINE_CORE = new SlimefunItemStack("ANCIENT_MACHINE_CORE", Material.LAPIS_BLOCK, "&6古代机器核心");
    public static final SlimefunItemStack VEX_GEM = new SlimefunItemStack("VEX_GEM", SkullItem.fromHash("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167"), "&6恼鬼宝石");
    public static final SlimefunItemStack MACHINE_SCRAP = new SlimefunItemStack("MACHINE_SCRAP", SkullItem.fromHash("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2"), "&6机器废料");
    public static final SlimefunItemStack ADVANCED_MACHINE_SCRAP = new SlimefunItemStack("ADVANCED_MACHINE_SCRAP",SkullItem.fromHash("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3"), "&6高级机器废料");
    public static final SlimefunItemStack STAR_DUST = new SlimefunItemStack("STAR_DUST", Material.NETHER_STAR, "&6星尘");
    public static final SlimefunItemStack GHOSTLY_ESSENCE = new SlimefunItemStack("GHOSTLY_ESSENCE", Material.WHITE_DYE, "&6幽灵精华");
    public static final SlimefunItemStack TESSERACTING_OBJ = new SlimefunItemStack("TESSERACTING_OBJ", Material.MUSHROOM_STEM, "&6光学对象", "&f&o它在你手中闪烁与移动");
    public static final SlimefunItemStack BEE = new SlimefunItemStack("BEE", SkullItem.fromHash("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47"), "&6蜜蜂");
    public static final SlimefunItemStack ROBOTIC_BEE = new SlimefunItemStack("ROBOTIC_BEE", SkullItem.fromHash("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140"), "&6机械蜜蜂");
    public static final SlimefunItemStack ADVANCED_ROBOTIC_BEE = new SlimefunItemStack("ADVANCED_ROBOTIC_BEE", SkullItem.fromHash("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09"), "&6高级机械蜜蜂");

    //Tools
    public static final SlimefunItemStack PICNIC_BASKET = new SlimefunItemStack("PICNIC_BASKET",
        new CustomItem(SkullItem.fromHash("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2")),
        "&6野餐篮",
        "",
        "&f可储存食物",
        "&f当你饿的时候自动喂食",
        "&f必须在你的背包内",
        "",
        "&f大小: &e27",
        "",
        "&7ID: <ID>",
        "",
        "&e右键点击 &7打开."
    );

    public static final SlimefunItemStack INVENTORY_FILTER = new SlimefunItemStack("INVENTORY_FILTER",
        Material.IRON_BARS,
        "&6背包过滤器",
        "",
        "&f过滤掉地板上的物品在这背包中",
        "",
        "&7ID: <ID>",
        "",
        "&e右键点击 &7打开."
    );

    public static final SlimefunItemStack ELECTRICAL_STIMULATOR = new SlimefunItemStack("ELECTRICAL_STIMULATOR",
        new CustomItem(SkullItem.fromHash("82a319cf66a4de12e3330e8bc4c82c985ccc3cb2230868c336a88fc4a22082a")),
        "&6电流刺激器",
        "",
        "&f自动喂食你能量",
        "",
        "&f&o刺激你的感官.",
        "",
        LoreBuilder.powerCharged(0, 1024)
    );

    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("ANGEL_GEM",
        Material.NETHERITE_BLOCK,
        "&6飞行宝石",
        "",
        "&f永久性创造飞行.",
        "&f有些速度调整设定.",
        "",
        "&f&o像鸟一样飞翔~",
        "",
        "&7飞行: <enabled>",
        "&7飞行速度: <speed>"
    );

    public static final SlimefunItemStack SCOOP = new SlimefunItemStack("SCOOP", 
        Material.IRON_SHOVEL,
        "&6勺子",
        "",
        "&f用于抓蜜蜂.",
        "",
        "&f&o请记得别被螫",
        "",
        LoreBuilder.powerCharged(0, 512)
    );

    public static final SlimefunItemStack DIMENSIONAL_HOME = new SlimefunItemStack("DIMENSIONAL_HOME",
        new CustomItem(SkullItem.fromHash("eb18cf9e1bf7ec57304ae92f2b00d91643cf0b65067dead34fb48baf18e3c385")),
        "&6维度之家",
        "",
        "&f将你传送到一个",
        "&f分开的世界家并返回",
        "",
        "&f&o家 甜蜜的家",
        "",
        "&7区块ID: <id>"
    );

    public static final SlimefunItemStack ITEM_BAND_HEALTH = new SlimefunItemStack("ITEM_BAND_HEALTH",
        new CustomItem(SkullItem.fromHash("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666")),
        "&6健康物品戒指",
        "",
        "&f当应用在装备或工具时",
        "&f将为你提供二级的生命值提升",
        "",
        "&f&o力量提升!"
    );

    public static final SlimefunItemStack ITEM_BAND_HASTE = new SlimefunItemStack("ITEM_BAND_HASTE",
        new CustomItem(SkullItem.fromHash("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367")),
        "&6挖掘加速戒指",
        "",
        "&f当应用在装备或工具时",
        "&f将为你提供二级的挖掘加速",
        "",
        "&f&o力量提升!"
    ); 
            
    public static final SlimefunItemStack TESSERACT_BINDER = new SlimefunItemStack("TESSERACT_BINDER",
        Material.NETHERITE_HOE,
        "&6光学绑定仪",
        "",
        "&f 用于绑定两个光学传输器.",
        "",
        "&f右键点击获取光学传输器的位置",
        "&f蹲下右键以将位置绑定至光学传输器",
        ""
    );

    public static final SlimefunItemStack LIQUID_TANK = new SlimefunItemStack("LIQUID_TANK",
        Material.BUCKET,
        "&6随身液体储存罐",
        "",
        "&f简单的液体掠夺者.",
        "",
        "&f装载液体: NO_FLUID",
        "&f容量: 0mb / 16000",
        ""
    );

    //Machines
    public static final SlimefunItemStack AUTO_KITCHEN = new SlimefunItemStack("AUTO_KITCHEN",
        Material.SMOKER,
        "&6自动厨房",
        "",
        "&f自动制作厨房的配方",
        "",
        "&f&o闻起来像饼干",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(16)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER = new SlimefunItemStack("GROWTH_CHAMBER",
        Material.GREEN_STAINED_GLASS,
        "&6生长仓",
        "",
        "&f自动生长&e植物&f.",
        "",
        "&f&o就像是一个小温室!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_MK2",
        Material.LIME_STAINED_GLASS,
        "&6生长仓 MK2",
        "",
        "&f自动生长&e植物&f.",
        "",
        "&f&o就像是一个小温室!",
        "",
        "&c3x 生产速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_END = new SlimefunItemStack("GROWTH_CHAMBER_END",
        Material.MAGENTA_STAINED_GLASS,
        "&d终界生长仓",
        "",
        "&f自动生长&d歌莱花.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_END_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_END_MK2",
        Material.PURPLE_STAINED_GLASS,
        "&d终界生长仓 MK2",
        "",
        "&f自动生长&d歌莱花.",
        "",
        "&c3x 生产速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)      
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER = new SlimefunItemStack("GROWTH_CHAMBER_NETHER",
        Material.RED_STAINED_GLASS,
        "&c地狱生长仓",
        "",
        "&f自动生长&c地狱&f植物.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_NETHER_MK2",
        Material.RED_STAINED_GLASS,
        "&c地狱生长仓 MK2",
        "",
        "&f自动生长&c地狱&f植物.",
        "",
        "&c3x 生产速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN",
    Material.CYAN_STAINED_GLASS,
        "&b海洋生长仓",
        "",
        "&f自动生长&9水中&f植物.",
        "可以使死亡的珊瑚复活!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN_MK2",
        Material.LIGHT_BLUE_STAINED_GLASS,
        "&b海洋生长仓 MK2",
        "",
        "&f自动生长&9水中&f植物.",
        "可以使死亡的珊瑚复活!",
        "",
        "&c3x 生产速度.",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack ANTIGRAVITY_BUBBLE = new SlimefunItemStack("ANTIGRAVITY_BUBBLE",
        Material.OBSIDIAN,
        "&6反重力泡泡",
        "",
        "&f 创造飞行在45格方块范围内",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(128)
    );

    public static final SlimefunItemStack WEATHER_CONTROLLER = new SlimefunItemStack("WEATHER_CONTROLLER",
        Material.BLUE_STAINED_GLASS,
        "&6天气控制器",
        "",
        "&f给予特定的物品来控制天气.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack POTION_SPRINKLER = new SlimefunItemStack("POTION_SPRINKLER",
        new CustomItem(SkullItem.fromHash("8d302104180cb79d5f4cf423649ddfa8ffb31a1875fa02a983cd248c72dfb0ea")),
        "&6药水洒水器",
        "",
        "&f范围性添加多人效果的药水装置.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(32)
    );
    
    public static final SlimefunItemStack BARBED_WIRE = new SlimefunItemStack("BARBED_WIRE",
        new CustomItem(SkullItem.fromHash("b2ac6c219004d82dfa627ffab664f29c53ecc112d91c9d7a9c915c426832412")),
        "&6铁丝网",
        "",
        "&f在范围内推开怪物.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(16)
    );        
    
    public static final SlimefunItemStack MATERIAL_HIVE = new SlimefunItemStack("MATERIAL_HIVE",
        Material.BEEHIVE,
        "&6材质蜂巢",
        "",
        "&f使用电力与蜜蜂, 慢慢产生物质.",
        "",
        LoreBuilder.radioactive(Radioactivity.HIGH),
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(1024)
    );

    public static final SlimefunItemStack WIRELESS_CHARGER = new SlimefunItemStack("WIRELESS_CHARGER",
        Material.CLAY,
        "&6无线充电器",
        "",
        "&f无线充电背包内的物品",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(16)
    );

    public static final SlimefunItemStack SEED_PLUCKER = new SlimefunItemStack("SEED_PLUCKER",
        Material.ORANGE_STAINED_GLASS,
        "&6种子采摘机",
        "",
        "&f从植物中取出种子.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack BANDAID_MANAGER = new SlimefunItemStack("BANDAID_MANAGER",
        Material.LAPIS_BLOCK,
        "&6物品戒指管理器",
        "",
        "&f管理物品戒指",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(48)
    );

    public static final SlimefunItemStack ORECHID = new SlimefunItemStack("ORECHID",
        Material.END_ROD,
        "&6矿物花",
        "",
        "&f使用石头或地狱石和电力, 可以制造它们各自的矿物.",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.power(1024, " 每个方块转换.")
   );

    public static final SlimefunItemStack WIRELESS_ENERGY_POINT = new SlimefunItemStack("WIRELESS_ENERGY_POINT",
        new CustomItem(SkullItem.fromHash("335a21d95e8597759fb259c951ea68e1ad3374ca41e56ef126ffabfe03c1e0")),
        "&6无线能量点",
        "",
        "&f无线传输能源",
        "&f来自无线能量库",
        "右键点击在无线能量库来连接!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerBuffer(5120),
        LoreBuilder.powerPerSecond(1024),
        ""
    );
    public static final SlimefunItemStack WIRELESS_ENERGY_BANK = new SlimefunItemStack("WIRELESS_ENERGY_BANK",
        Material.SNOW_BLOCK,
        "&6无线能量库",
        "",
        "&f储存能源给",
        "&f无线能量点使用.",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
        LoreBuilder.powerBuffer(10240),
        LoreBuilder.powerPerSecond(1024),
        ""
    );

    public static final SlimefunItemStack WIRELESS_ITEM_INPUT = new SlimefunItemStack("WIRELESS_ITEM_INPUT",
        new CustomItem(SkullItem.fromHash("abb55560c695d976b346e188d3df2bcd8c5aa32b933141a9715c42f64cb6cee")),
        "&6无线物品输入",
        "",
        "&f以无线的方式传输物品",
        "&f 到无线物品输出",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.power(8, " 每组物品"),
        ""
    );

    public static final SlimefunItemStack WIRELESS_ITEM_OUTPUT = new SlimefunItemStack("WIRELESS_ITEM_OUTPUT",
        new CustomItem(SkullItem.fromHash("c510d9b61ca333d2946c61a26cb17e374d4adb573b46afdebaf89f65ba5d4ae2")),
        "&6无线物品输出",
        "",
        "&f以无线的方式传输物品",
        "&f从无线物品输入",
        "右键点击无线物品输出来连接!",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), 
        LoreBuilder.powerBuffer(1024),
        LoreBuilder.power(8, " 每组物品"),
        ""
    );

    public static final SlimefunItemStack TESSERACT = new SlimefunItemStack("TESSERACT",
        Material.PURPUR_BLOCK,
        "&6光学传输器",
        "",
        "&f无线传输物品与能源",
        "&f甚至可以双向传输!",
        "右键另一个光学传输器来连接!",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerBuffer(65535),
        LoreBuilder.powerPerSecond(1024),
        ""  
    );

    //Generators
    public static final SlimefunItemStack WATER_MILL = new SlimefunItemStack("WATER_MILL",
        Material.COBBLESTONE_WALL,
        "&6水轮发电机",
        "",
        "&f通过流动的水来产生能源",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.powerPerSecond(16)
    );

    public static final SlimefunItemStack WATER_TURBINE = new SlimefunItemStack("WATER_TURBINE",
        Material.PRISMARINE_WALL,
        "&6水力涡轮机",
        "",
        "&f通过流动的水来产生能源",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(64)
    );

    public static final SlimefunItemStack DRAGON_GENERATOR = new SlimefunItemStack("DRAGON_GENERATOR",
        Material.GRAY_CONCRETE,
        "&6龙蛋发电机",
        "",
        "&f从龙蛋的温暖中产生能源",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(512),
        LoreBuilder.powerPerSecond(32)
    );

    public static final SlimefunItemStack CHIPPING_GENERATOR = new SlimefunItemStack("CHIPPING_GENERATOR",
        Material.SPRUCE_WOOD,
        "&6切屑发电机",
        "",
        "&f从损坏的物品提取能源",
        "&f(基于有耐久度的物品)",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.power(8, " 每个耐久度")
    );

    public static final SlimefunItemStack CULINARY_GENERATOR = new SlimefunItemStack("CULINARY_GENERATOR",
        Material.BLAST_FURNACE,
        "&6烹饪发电机",
        "",
        "&f从食物中提取能源",
        "",
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(8)
    );

    public static final SlimefunItemStack STARDUST_REACTOR = new SlimefunItemStack("STARDUST_REACTOR",
        Material.IRON_BLOCK,
        "&6星尘反应炉",
        "",
        "&6使用星尘来产生大量的能源.",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(32768),
        LoreBuilder.powerPerSecond(1024)
    );
}
