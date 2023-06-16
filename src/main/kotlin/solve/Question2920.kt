package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2920
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val st = StringTokenizer(br.readLine(), " ")
        var ascending = false
        var descending = false
        var mixed = false
        var beforeVal = st.nextToken().toInt()


        for(i in 2..8) {
            val curr = st.nextToken().toInt()
            if(curr-1 == beforeVal || (beforeVal == 8 && curr == 1)) ascending = true
            else if(curr+1 == beforeVal || (beforeVal == 1 && curr == 8)) descending = true
            else {
                mixed = true
            }
            beforeVal = curr
        }

        if(mixed) bw.write("mixed")
        else if(ascending) bw.write("ascending")
        else if(descending) bw.write("descending")

        bw.flush()
    }
}