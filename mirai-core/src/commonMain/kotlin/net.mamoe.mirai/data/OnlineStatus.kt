package net.mamoe.mirai.data

/**
 * 在线状态
 */
enum class OnlineStatus(val id: Int) {
    /**
     * 我在线上
     */
    ONLINE(11),
    /**
     * 离线
     */
    OFFLINE(21),
    /**
     * 离开
     */
    AWAY(31),
    /**
     * 隐身
     */
    INVISIABLE(41),
    /**
     * 忙碌
     */
    BUSY(50),
    /**
     * Q 我吧
     */
    Q_ME(60),
    /**
     * 请勿打扰
     */
    DND(70),
    /**
     * 离线但接收消息
     */
    RECEIVE_OFFLINE_MESSAGE(95),

    /**
     * 解析错误等
     */
    UNKNOWN(-1);

    companion object {
        fun ofId(id: Int): OnlineStatus = values().first { it.id == id }
        fun ofIdOrNull(id: Int): OnlineStatus? = values().firstOrNull { it.id == id }
    }
}