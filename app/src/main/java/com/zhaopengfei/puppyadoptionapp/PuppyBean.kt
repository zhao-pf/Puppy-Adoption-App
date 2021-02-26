package com.zhaopengfei.puppyadoptionapp

import java.io.Serializable

/**
 * @Author: 赵鹏飞
 * @Github: https://github.com/zhao-pf
 * @Date: 2021/2/26 21:38
 * @Description: TODO
 */
data class PuppyBean(
    val pic: Int=R.drawable.puppy11,
    val name: String="名字",
    val age: Int=5,
    val from: String="来自",
    val varieties: String="品种",
    val introduce: String="介绍",
): Serializable