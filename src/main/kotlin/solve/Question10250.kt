package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question10250 {
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val case = br.readLine().toInt()

        for(i in 1 .. case) {
            val st = StringTokenizer(br.readLine())
            val h = st.nextToken().toInt()
            val w = st.nextToken().toInt()
            val n = st.nextToken().toInt()

            bw.write("${if(n%h==0) h else n%h}${if(n%h==0 && (n/h) < 10) "0" else if (n%h!=0 && (n/h)+1 < 10) "0" else ""}${if(n%h==0) n/h else (n/h)+1}\n")
        }
        bw.flush()
    }
}