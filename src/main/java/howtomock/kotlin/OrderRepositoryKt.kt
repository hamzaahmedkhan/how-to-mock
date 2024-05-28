package howtomock.kotlin

import howtomock.java.OrderEntityJv
import java.net.NetworkInterface

class OrderRepositoryKt(private val networkInterface: NetworkInterface) {

    fun saveOrderEntityKt(orderEntityKt: OrderEntityKt): Int {
        return 1000
    }

    fun saveOrderEntityJv(orderEntityJv: OrderEntityJv, name: List<String> ): Int {
        return 1000
    }
}