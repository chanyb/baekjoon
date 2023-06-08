package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

class Question2581 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val sb = StringBuilder()
        var min: Int? = null
        var sum: Int = 0

        val M = br.readLine().toInt()
        val N = br.readLine().toInt()

        for(idx in M .. N) {
            if(idx < 2) continue
            if (isPrimeNumber(idx)) {
                sum += idx
                min = min ?: idx
            }
        }

        if(sum != 0) {
            bw.write(sum.toString())
            bw.write("\n")
            min?.toString()?.let { bw.write(it) }
        } else {
            bw.write("-1")
        }


        bw.flush()
    }

    fun isPrimeNumber(n: Int) : Boolean {
        var isPrime = true
        for(idx in 2 until n) {
            if(n%idx == 0) {
                isPrime = false
                break
            }
        }
        return isPrime
    }
}