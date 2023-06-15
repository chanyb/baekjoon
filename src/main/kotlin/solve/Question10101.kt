package solve

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Question10101 {
    constructor() {
        val br = BufferedReader(InputStreamReader(System.`in`)) // in이 예약어 이기 때문에, ``감싸서 사용
        val bw = BufferedWriter(OutputStreamWriter(System.`out`))
        val arr = IntArray(3)
        var equilateral = false
        var isosceles = false
        var scalene = true
        var sum = 0

        for(i in 0..2) {
            arr[i] = br.readLine().toInt();
            sum += arr[i]
            if (isosceles) {
                if(arr[i] == arr[i-1]) {
                    scalene = false
                    equilateral = true
                }
            } else if (scalene) {
                for(j in i downTo 1) {
                    if(arr[j] == arr[j-1]) {
                        scalene = false
                        isosceles = true
                    }
                }
            }
        }
        if (sum != 180) {
            bw.write("Error")
        }
        else {
            if(equilateral) bw.write("Equilateral")
            else if(isosceles) {
                bw.write("Isosceles")
            } else {
                if(arr[2] == arr[0]) bw.write("Isosceles")
                else bw.write("Scalene")
            }
        }
        bw.flush()
    }
}