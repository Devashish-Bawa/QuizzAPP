package com.devashish.quizzapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_question"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Questions> {
        val questionsList = ArrayList<Questions> ()

        val que1 = Questions(1,
                    "What country does this flag belongs to? ",
                    R.drawable.ic_flag_of_argentina ,
                    "Argentina",
                    "Austria" ,
                    "Armenia",
                    "Bulgaria",
                    1
        )
        questionsList.add(que1)

        val que2 = Questions(2,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_australia ,
            "Argentina",
            "USA" ,
            "Armenia",
            "Australia",
            4
        )
        questionsList.add(que2)

        val que3 = Questions(3,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_belgium ,
            "Germany",
            "Belgium" ,
            "Russia",
            "Kuwait",
            2
        )
        questionsList.add(que3)

        val que4 = Questions(4,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_brazil ,
            "Rio de Janeiro",
            "Brazil" ,
            "Peru",
            "Bolivia",
            2
        )
        questionsList.add(que4)

        val que5 = Questions(5,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_denmark ,
            "Poland",
            "Austria" ,
            "Denmark",
            "Switzerland",
            3
        )
        questionsList.add(que5)

        val que6 = Questions(6,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_fiji,
            "Palau",
            "Fiji" ,
            "Tuvalu",
            "Samoa",
            2
        )
        questionsList.add(que6)

        val que7 = Questions(7,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_germany ,
            "Sweden",
            "Greece" ,
            "Germany",
            "Ukraine",
            3
        )
        questionsList.add(que7)

        val que8 = Questions(8,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_india ,
            "North Korea",
            "Iran" ,
            "India",
            "Vietnam",
            3
        )
        questionsList.add(que8)

        val que9 = Questions(9,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_kuwait,
            "Saudi Arabia",
            "Kuwait" ,
            "Singapore",
            "Lebanon",
            2
        )
        questionsList.add(que9)

        val que10 = Questions(10,
            "What country does this flag belongs to? ",
            R.drawable.ic_flag_of_new_zealand ,
            "Australia",
            "Austria" ,
            "USA",
            "New Zealand",
            1
        )
        questionsList.add(que10)


        return questionsList
    }
}