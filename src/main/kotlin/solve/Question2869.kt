package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2869
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var st = StringTokenizer(br.readLine(), " ")
        var current = st.nextToken().toInt()
        val down = st.nextToken().toInt()
        val target = st.nextToken().toInt()
        val step = current-down
        var day = 1
        val extra = if((target-current)%step == 0) 0 else 1
        bw.write((day + extra + (target-current)/step).toString())
        bw.flush()
    }
}