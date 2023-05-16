package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1193
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var add = 1
        var max = 1
        var x = br.readLine().toInt()
        while (true) {
            if (max >= x) {
                break
            }
            max += ++add
        }
        if(add%2 == 0) {
            bw.write("${add-(max-x)}/${max-x+1}")
        }
        else {
            bw.write("${1+max-x}/${add-(max-x)}")
        }
        bw.flush()
    }
}