package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.DecimalFormat
import java.util.StringTokenizer

class Question3009 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var x = Array(3){0}
        var y = Array(3){0}
        for (idx in 0 until 3) {
            val st = StringTokenizer(br.readLine())
            x[idx] = st.nextToken().toInt()
            y[idx] = st.nextToken().toInt()
        }

        if(x[0] == x[1]) bw.write(x[2].toString())
        else if (x[0] == x[2]) bw.write(x[1].toString())
        else if (x[1] == x[2]) bw.write(x[0].toString())
        bw.write(" ")
        if(y[0] == y[1]) bw.write(y[2].toString())
        else if (y[0] == y[2]) bw.write(y[1].toString())
        else if (y[1] == y[2]) bw.write(y[0].toString())
        bw.flush()


    }
}