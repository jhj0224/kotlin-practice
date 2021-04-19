fun main() {
    println("== 회원관리 프로그램 시작 ==")

    print("회원 수 : ")
    val MembersCount = readLine()!!.trim().toInt()

    var members = Array<Member?>(MembersCount, {null})

    println(" = ${MembersCount}의 회원 정보를 입력합니다. =")

    for (i in 0 until MembersCount) {

        var id = i + 1
        print("${i + 1}번째 회원의 이름 : ")
        var name = readLine()!!.trim()
        print("${i + 1}번째 회원의 나이 : ")
        var age = readLine()!!.trim().toInt()
        print("${i + 1}번째 회원의 성별(m/w) : ")
        var gender = readLine()!!.trim()[0]

        println("${i + 1}번 회원의 정보가 등록되었습니다.")

        var member = Member(id, name, age, gender)
        members[i] = member

    }

    println("= 입력하신 회원 리스트 = ")
    println("번호 / 이름 / 나이 / 성별 ")
    for (Member in members  ) {
        println("${Member?.id}, ${Member?.name}, ${Member?.age}, ${Member?.ManGirl()}")
    }


    println("== 회원관리 프로그램 끝 ==")
}

class Member(
    var id : Int,
    var name : String,
    var age : Int,
    var gender : Char

) {
    fun ManGirl() : String {
        if (gender == 'w'){
            return "여자"
        }
        return "남자"

    }

}