package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question9086 {
    constructor () {
        val value = 3
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var count = br.readLine().toInt()
        var sb = StringBuilder()

        var strArray = Array<String?>(count){null}

        for (idx: Int in 0 until count) {
            strArray[idx] = br.readLine()
        }

        for (str in strArray) {
            sb.append(str?.get(0))
            sb.append(str?.get(str.length-1))
            sb.append("\n")
        }

        bw.append(sb.toString())
        bw.flush()
    }

}