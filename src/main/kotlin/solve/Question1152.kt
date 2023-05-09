package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1152// in이 예약어 이기 때문에, ``감싸서 사용
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val str = br.readLine().trim()
        val res = str.split(" ").size.toString()

        if (res == "1" && str.isEmpty()) bw.write("0")
        else bw.write(res)
        bw.flush()


    }

}