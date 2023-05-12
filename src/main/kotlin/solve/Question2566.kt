package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2566 {
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        var st: StringTokenizer
        val size = 9
        var max = 0
        var position = Pair(0,0)

        for (idx in 0 until size) {
            st = StringTokenizer(br.readLine(), " ")
            for(jdx in 0 until size) {
                var before = max
                max = isbig(max, st.nextToken().toInt())
                if(before != max) position = Pair(idx, jdx)
            }
        }

        bw.write("$max\n${position.first+1} ${position.second+1}")
        bw.flush()
    }

    fun isbig(a:Int, b:Int) : Int {
        if (a > b) return a else return b
    }

}