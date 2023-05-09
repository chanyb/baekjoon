package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question10809 {
    constructor () {
        var br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        var bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var arr = IntArray(26){-1}
        var inputString = br.readLine()

        for (idx in inputString.indices) {
            var value = inputString[idx]-97
            if (arr[value.code] == -1) arr[value.code] = idx
        }

        bw.append(arr.joinToString(" "))
        bw.flush()
    }

}