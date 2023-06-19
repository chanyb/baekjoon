package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question1181 {
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val num = br.readLine().toInt()
        val sortedArr = ArrayList<String>()


        for(idx in 1..num) {
            val word = br.readLine().toString()
            var isAdd = false
            for(jdx in sortedArr.indices) {
                if(isAdd) break
                if(sortedArr[jdx].length > word.length) {
                    sortedArr.add(jdx, word)
                    isAdd = true
                } else if (sortedArr[jdx].length == word.length) {
                    for(wordIdx in word.indices) {
                        if(word[wordIdx] < sortedArr[jdx][wordIdx]) {
                            val wordAscii = word[wordIdx]
                            val sortedWordAscii = sortedArr[jdx][wordIdx]
                            sortedArr.add(jdx, word)
                            isAdd = true
                            break
                        } else if (word[wordIdx] > sortedArr[jdx][wordIdx]) {
                            break
                        }

                        if(wordIdx == word.length-1) {
                            isAdd = true
                            break
                        }
                    }
                }
            }

            if(!isAdd) sortedArr.add(word)
        }

        for(word in sortedArr) {
            bw.append(word)
            bw.newLine()
        }
        bw.flush()
    }
}