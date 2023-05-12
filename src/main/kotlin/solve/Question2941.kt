package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question2941
{
    init {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        var sum = 0
        val croAlphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
        var inputArr = CharArray(3){'?'}
        var idx = 0

        while(true) {
            val ch = br.read().toChar()
            if (ch == '\n' || ch.code == -1) {

                if (croAlphabet.any { it == String(inputArr).substring(0,idx+1) }) {
                    sum++
                    break
                }

                for (jdx in 0 until idx) {
                    sum++
                }
                break
            }
            inputArr[idx] = ch


            if (croAlphabet.any { it == String(inputArr).substring(0,idx+1) }) {
                sum++
                inputArr = CharArray(3){'?'}
                idx = 0
                continue
            }

            if (idx == 2) {
                val ch1 = inputArr[1]
                val ch2 = inputArr[2]
                if (croAlphabet.any { it == StringBuilder().append(ch1).append(ch2).toString()}) {
                    sum+=2
                    inputArr = CharArray(3){'?'}
                    idx = 0
                    continue
                }

                inputArr[0] = inputArr[1]
                inputArr[1] = inputArr[2]
                sum++
                inputArr[2] = '?'
                continue
            }

            idx++
        }
        bw.write(sum.toString())
        bw.flush()

    }

}