package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question5073 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()
        val arr = IntArray(3)
        var equilateral = false
        var isosceles = false
        var scalene = true
        var sum = 0

        while(true) {
            val st = StringTokenizer(br.readLine())
            arr[0] = st.nextToken().toInt()
            arr[1] = st.nextToken().toInt()
            arr[2] = st.nextToken().toInt()

            var max = arr[0]
            if(max < arr[1]) max = arr[1]
            if(max < arr[2]) max = arr[2]

            if(arr[0]+arr[1]+arr[2] == 0) {
                sb.setLength(sb.length-1)
                bw.write(sb.toString())
                bw.flush()
                break
            }

            if((arr[0]+arr[1]+arr[2] - max) <= max) {
                sb.append("Invalid")
                sb.append(("\n"))
                continue
            }

            if(arr[0]==arr[1] || arr[0]==arr[2] || arr[1]==arr[2]) {
                if(arr[0]==arr[1] && arr[0] == arr[2]) {
                    // Equilateral
                    sb.append("Equilateral\n")
                } else {
                    // Isosceles
                    sb.append("Isosceles\n")
                }
            } else {
                // Scalene
                sb.append("Scalene\n")
            }

        }

        bw.flush()
    }
}