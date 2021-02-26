package com.zhaopengfei.puppyadoptionapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

val puppyList = mutableStateListOf<PuppyBean>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            title = "宠物收养"// 标题
            Greeting(puppyList) {
                val intent = Intent(this, PuppyActivity::class.java)
                intent.putExtra("data", it)
                startActivity(intent)
            }// 列表
        }
        initData()// 初始化

    }

    fun initData() {
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy1,
                name = "小绅士",
                age = (1..10).random(),
                from = "北京",
                varieties = "母",
                introduce = "2013年8月10日，在我们领养之家门口拴着一条被遗弃的八哥犬，旁边放一紫色环保袋，袋里有水、食物、药及垫子等物品。经过检查，发现它已被绝育，双眼红肿，左眼有手术线，较浑浊。经过治疗，现在已康复，等待好心人领养。",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy2,
                name = "欣欣",
                age = (1..10).random(),
                from = "上海",
                varieties = "公",
                introduce = "2011.5月, 我们义工陈小姐在深圳湾口岸附近的海关停车场门口发现它, 当时身上很脏, 陈小姐听停车场收费小姐说这只狗在这里流浪几个月了, 前段时间还生了几只小狗被人拿走了, 海关有几个人时不时会给它带点食物喂它, 陈小姐担心它居食无保证, 加上还会再生小狗, 生命很可怜, 于是就在收费小姐的帮助下带到附近的爱宁宠物医院, 经检查狗狗很健康, 做绝育后接回领养之家喂养. ",
            )
        )

        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy3,
                name = "湾湾",
                age = (1..10).random(),
                from = "广州 广东",
                varieties = "黄白色,混血 公",
                introduce = "2013年10月28日，常给领养之家送水的工人带来只小狗，说是狗狗自己跑到他家店里的，后来就一直不走了，他是个工人没能力养它，请求领养之家收留，经过负责人同意，狗狗由领养之家收留，期待好心人的领养。",
            )
        )

        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy4,
                name = "波奇",
                age = (1..10).random(),
                from = "上海 浦东",
                varieties = "白色混血 母",
                introduce = "2013年8月1日的晚上, 我们的工作人员魏小姐回来, 发现有人丢了一只咖啡色的小贵宾犬在领养之家的门外, 我们只好收养了它, 给它起名叫\"米其\".小家伙挺乖.",
            )
        )

        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy5,
                name = "来福",
                age = (1..10).random(),
                from = "吉林 长春",
                varieties = "混血 母",
                introduce = "2014年2月7日，义工谢小姐在海岸城转后海大道的转弯辅道上发现一只狗狗趴在那，见比较危险就下车想把狗狗带去人行道，可是走近才发现狗狗双后腿法动，嘴也是歪的，应该遭遇车祸，于是将它送去医院。经检查狗狗后腿、股骨头、嘴都骨折。经过手术治疗，现已康复，没有任何行动不便的地方，期待好人领养！",
            )
        )

        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy6,
                name = "来福",
                age = (1..10).random(),
                from = "山西",
                varieties = "混血 公",
                introduce = "2012年9月11日我们义工的表妹在罗湖书城后面的马路中间遇到它，当时在马路上来回奔跑，很危险。于是立刻拉住狗狗，并在周围城中村，宠物店等地牵着狗狗到处找其主人。但是经过3天的寻找仍没结果。现在义工表妹家中暂时寄养，等待新主人。",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy7,
                name = "松松",
                age = (1..10).random(),
                from = "杭州",
                varieties = "混血 公",
                introduce = "2013年9月16日, 我们在网上看到有人说南山宜家超市停车场里有一只怀孕的母狗流浪多日, 而且狗狗经常向路人嚎叫,  我们担心会受到他人的伤害, 于是我们赶紧去救它, 当时母狗肚子很大, 我们想抓去做绝育, 结果没成功, 接连3天又去都没有再看到它, 等到20日看到时发现狗狗已经生产, 把小狗生在哪里我们也不知道, 结果在一个月里, 我们的负责人和义工谢小姐轮流每天下班后带肉去喂狗妈, 直到10月17日我们发现小狗在宜家停车场外的桥底下, 共有5只小狗, 已经会跑出来玩, 于是我们派人将它们一家全部带到领养之家喂养, 5个小狗中我们按个子大小排行来起名, 这只起名叫\"宜家3\".我们希望能有好心人来领养.",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy8,
                name = "花无缺",
                age = (1..10).random(),
                from = "广州",
                varieties = "灰白色混血 母",
                introduce = "2008.7在白石洲路边水果摊旁捡到,当时很赃,瘦的皮包骨,送往宠物医院检查,发现患有细小病,经及时治疗现已痊愈.由于身体原因需较长时间恢复,目前健康状况良好，于2009年七月已绝育.等待领养。",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy9,
                name = "娜娜",
                age = (1..10).random(),
                from = "上海",
                varieties = "灰白色混血 母",
                introduce = "2007，11被人救助送至领养之家。",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy10,
                name = "壮壮",
                age = (1..10).random(),
                from = "杭州",
                varieties = "公",
                introduce = "2011年6月11日晚12点多，我们义工谢小姐在自家小区喂流浪猫时遇到了这只狗狗，当时狗狗还跟着一位小姐进了电梯，可几分钟后狗狗自己又坐着电梯下来了，谢小姐在楼下等了近一小时也没人来找。狗狗当时很干净，只是因小雨，脚和肚子较湿较脏。保安说从来没在该小区见过这只狗狗，可能是附近小区走失的。随后的一个多星期，我们在周围小区、马路、网上都发帖寻找狗狗主人，但一直没消息，所以决定给狗狗找寻新主人。",
            )
        )
        puppyList.add(
            PuppyBean(
                pic = R.drawable.puppy11,
                name = "宜家5",
                age = (1..10).random(),
                from = "北京",
                varieties = "灰白色混血 公",
                introduce = "2012年9月11日我们义工的表妹在罗湖书城后面的马路中间遇到它，当时在马路上来回奔跑，很危险。于是立刻拉住狗狗，并在周围城中村，宠物店等地牵着狗狗到处找其主人。但是经过3天的寻找仍没结果。现在义工表妹家中暂时寄养，等待新主人。",
            )
        )
        puppyList.addAll(puppyList)
        puppyList.addAll(puppyList)
        puppyList.shuffle()
    }
}

@Composable
fun Greeting(puppyList: SnapshotStateList<PuppyBean>, onclick: ((puppy: PuppyBean) -> Unit)) {
    LazyColumn(
        modifier = Modifier.padding(4.dp)
    ) {
        items(puppyList) { it ->
            Card(
                Modifier
                    .padding(2.dp)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .clickable(onClick = {
                        onclick.invoke(it)
                    })
            ) {
                val padding = Modifier.padding(4.dp)
                Row {
                    Image(
                        imageResource(it.pic),
                        modifier = Modifier
                            .width(140.dp)
                            .padding(4.dp),
                        contentScale = ContentScale.Fit,
                    )
                    Column(modifier = padding) {
                        Text(
                            "狗狗名称:  ${it.name}",
                            maxLines = 2 // 最长行数
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "狗狗年龄:  ${it.age}",
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            "狗狗来自:  ${it.from}",
                            color = Color.Red,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}



