# Dyna科技
我制作一套物品和机器, 使这些东西更加简单与有趣.
其中大多数可能过于强大或过于不足.

**该插件需求JAVA 11**

### [下载繁体翻译版](https://xmikux.github.io/builds/xMikux/DynaTech/master/)
[![Build Status](https://xmikux.github.io/builds/xMikux/DynaTech/master/badge.svg)](https://xmikux.github.io/builds/xMikux/DynaTech/master)

### [Download](https://thebusybiscuit.github.io/builds/ProfElements/DynaTech/master/)
[![Build Status](https://thebusybiscuit.github.io/builds/ProfElements/DynaTech/master/badge.svg)](https://thebusybiscuit.github.io/builds/ProfElements/DynaTech/master)

此为**非官方**版本, 请勿在该作者的问题追踪内回报!
[原项目连结](https://github.com/ProfElements/DynaTech)

## 机器
- **自动厨房** - 如果你安装了ExoticGarden, 此机器将可使用. 它会自动制作任何设定在内的配方.
- **生长仓** - 自动生长一些植物. 我们有多个种类满足你的需求. 支持Exotic Garden附加的树苗,植物和灌木树.
- **反重力泡泡** - 通电后, 在45格范围内暂时的创造飞行.
- **天气控制器** - 给予关键物品来控制天气 (向日葵 > 晴朗, 紫丁香 > 降雨, 苦力怕头颅 > 雷雨).
- **药水洒水器** - 范围性药水装置, 药水基本上具有耐久度.
- **铁丝网** - 范围内推开怪物.
- **材质蜂巢** - 一个无限资源产生机, 需要蜜蜂与一个物品输出堆. 支持的材料在 [这里](https://github.com/ProfElements/DynaTech/blob/1b6aee96937da31c7bdb84df284392530149ce63/src/main/java/me/profelements/dynatech/items/electric/MaterialHive.java#L169). 对于材质蜂巢, 你投入的每只蜜蜂都会减少生产材料的时间, 因此128只蜜蜂会比1只蜜蜂更好. 请注意, 每种蜜蜂类型的秒数都不同. 检查蜜蜂部分来获取更多讯息.
- **无线充电器** - 在16格方块半径范围内充玩家背包内可充电的物品
- **种子采摘机** - 从植物材料中提取种子, 支持Exotic Garden的水果, 但不支持精华.
- **物品戒指管理器** - 管理应用或去除物品戒指.
- **矿物花** - 将石头与地狱石分别转化成主世界和地狱的矿物
- **无线能量库** - 储存能源来无线传输, 用无线能量点
- **无线能量点** - 使用无线能量库的能源传输无线能源
- **无线物品输入** - 输入单方向性无线传输物品
- **无线物品输出** - 输出单方向性无线传输物品
- **光学传输器** - 双向物品与能源传输.

## 发电机
- **水轮发电机** - 从流动的水中产生能量 (将水淹入发电机)
- **龙蛋发电机** - 从龙蛋的温暖中产生能量. (将龙蛋放置在上方)
- **切屑发电机** - 从损坏或有耐久的物品中产生能量
- **烹饪发电机** - 从食物中产生能量, 支持Exotic Garden附加食物类别内的食物.
- **星尘反应炉** - 从星尘中产生能源, 非常多的能源

## 工具
- **野餐篮** - 它是升级版的冰箱. 可以吃任何ExoticGarden的自定义食物, 也可以只吃原版食物, 并且可以在items.yml内配置黑名单
- **电流刺激器** - 喂食玩家能源. 
- **背包过滤器** - 捡起物品后, 如果物品与背包过滤器中的过滤物品相同, 则该物品将会丢入虚空之中.
- **飞行宝石** - 永久性创造飞行, 有些速度调整设定.
- **勺子** - 获得天然蜜蜂的唯一方法. 勺子它们成为物品形式.
- **维度之家** - 在另一个维度空间提供你一个家, 以往返其他地方. (如果你在维度中, 他将会发送你回去你的床重生点位置.)
- **光学绑定仪** - 以更好的方式绑定光学传输器, 并直接连结
- **随身液体储存罐** - 可容纳16桶任何液体. 也可以把它们放回去

## 蜜蜂
- **蜜蜂** - 天然蜜蜂, 每一只蜜蜂减少2秒钟在材质蜂巢内的创建资源时间.
- **机械蜜蜂** - 由神奇魔法与废料所制成的机械蜜蜂. 减少2秒钟在材质蜂巢内生产资源的时间.
- **高级机械蜜蜂** - 机械蜜蜂的高级版本. 减少10秒钟在材质蜂巢内生产资源的时间.

## 物品戒指
- **健康物品戒指** - 当应用于装备或武器时, 穿戴或手持该物品可获得四颗额外的心.
- **挖掘加速戒指** - 当应用在装备或武器时, 穿戴或手持该物品将获得等级二加速.

## 整合 
 - **恼鬼怪物数据卡** - 如果有安装 InfinityExpansion (无限附加), 那么你将会有恼鬼怪物数据卡, 来帮助你获取幽灵精华与恼鬼宝石

## Credits
 [NCBPFluffyBear](https://github.com/ncbpfluffybear) for their autocrafter code since it helped alot with the Auto-Kitchen.

 [Mooy1](https://github.com/mooy1) for their hydro generator code so I could figure out how to do waterlogging right.

 [Seggan](https://github.com/seggan) for showing me how to make a good container class instead of using Slimefun's default.

 [WalshyDev](https://github.com/WalshyDev) for answering my spam in the programming help channel.

 [Slimefun Discord](https://slimefun.dev/discord) for putting up with my outright spam of the programming help channel.

 [Slimefun](https://github.com/slimefun/slimefun4) for being incredibly intuitive to make an addon for and overall being generally helpful when needing examples.
