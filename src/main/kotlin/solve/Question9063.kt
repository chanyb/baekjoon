package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

class Question9063 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val count = br.readLine().toInt()
        var minX = 10000
        var maxX = -10000
        var minY = 10000
        var maxY = -10000

        for (idx in 0 until count) {
            val st = StringTokenizer(br.readLine())
            val x = st.nextToken().toInt()
            val y = st.nextToken().toInt()
            maxX = max(maxX, x)
            maxY = max(maxY, y)
            minX = min(minX, x)
            minY = min(minY, y)
        }


        bw.write(((maxX-minX)*(maxY-minY)).toString())
        bw.flush()
    }
}