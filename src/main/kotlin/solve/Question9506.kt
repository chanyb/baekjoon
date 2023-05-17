package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question9506 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()
        while (true) {
            val input = br.readLine().toInt()
            var idx = 1
            if(input == -1) break
            val array = Array(input+1){0}
            for(i in 1 until input) {
                if(input%i == 0) {
                    array[0] += i
                    array[idx++] = i
                }
            }

            if(array[0] == input) {
                sb.append("$input =")
                for(i in 1 until idx) {
                    sb.append(" ${array[i]} +")
                }
                sb.setLength(sb.length-2)
            } else {
                sb.append("$input is NOT perfect.")
            }
            sb.append("\n")
        }

        bw.write(sb.toString().substring(0, sb.length-1))
        bw.flush()
    }
}