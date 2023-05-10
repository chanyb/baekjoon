package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question3003
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine()," ")
        bw.append((1-st.nextToken().toInt()).toString() + " ")
        bw.append((1-st.nextToken().toInt()).toString() + " ")
        bw.append((2-st.nextToken().toInt()).toString() + " ")
        bw.append((2-st.nextToken().toInt()).toString() + " ")
        bw.append((2-st.nextToken().toInt()).toString() + " ")
        bw.append((8-st.nextToken().toInt()).toString() + " ")
        bw.flush()

    }
}