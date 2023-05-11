package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1157 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))

        val word = br.readLine().uppercase()
        var charMap = HashMap<Int, Int>()

        for (c in word) {
            charMap[c.code] = charMap[c.code]?.plus(1) ?:1
        }

        var max = 0
        var ch = '?'
        var questionMark = false
        for (map in charMap) {
            if (max == map.value) questionMark = true
            else if (max < map.value) {
                max = map.value
                questionMark = false
                ch = map.key.toChar()
            }

        }

        if (questionMark) bw.write("?")
        else bw.write(ch.toString())

        bw.flush()
    }
}