package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1316
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val wordNum = br.readLine().toInt()
        var groupWordCount = 0
        for (idx in 0 until wordNum) {
            var isSequence = false
            var word = IntArray(100)
            var wordIdx = 0
            var isNot = false
            while (true) {
                val ch = br.read().toChar()

                if (ch == '\n') {
                    if(!isNot) groupWordCount++
                    break
                }
                if(isNot) continue

                if(wordIdx > 0) isSequence = word[wordIdx-1] == ch.code

                if (!isSequence) {
                    if (word.any { it == ch.code }) {
                        // 연속중이아닌데, 있는 단어가 있다.
                        isNot = true
                    }
                }

                word[wordIdx] = ch.code
                wordIdx++
            }
        }

        bw.write(groupWordCount.toString())
        bw.flush()
    }
}