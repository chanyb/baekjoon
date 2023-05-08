package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question5597 {
    constructor() {
        val student_count = 30
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))

        var students = IntArray(student_count)

        for (idx: Int in 0 until student_count-2) {
            val n = br.readLine().toInt()
            students[n-1] = 1
        }


        var sb = StringBuilder()
        for (idx: Int in 0 until student_count) {
            if(students[idx] == 0) {
                sb.append(idx+1)
                sb.append("\n")
            }
        }

        sb.setLength(sb.length-1)

        bw.append(sb.toString())
        bw.flush()
    }
}