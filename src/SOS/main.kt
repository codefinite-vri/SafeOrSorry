package SOS

import kotlin.system.exitProcess
var choice : Int = 0
var score : Int = 500
fun main(args:Array<String>){
    println("Hello, I am Quarantina. What's your name?")
    var name = readLine()!!
    while(name.contains(" ")) {
        println("Please type only your first name")
        name = readLine()!!
    }
    println("That's a nice name. I sound like an old woman but I am 21 years old. What about you? How old are you?")
    var age = readLine()?.toIntOrNull() ?: 0
    while (age<0 || age>120){
        println("Please type your real age")
        age = readLine()?.toIntOrNull() ?: 0
    }
    if(age<10|| age>=80){
        score-=200
    }
    else if(age<25 || (age>60 && age<80)){
        score-=100
    }
    println("Your current immunity score is $score")
    val SOS1 = SOS(name,age)
    println("Hello ${SOS1.name}. Glad to meet you on this online platform. Covid-19 and the lockdown has changed our lives completely. To drive your boredom away, I have a small roleplay for you! Are you ready to join me on a virtual journey of fun?")
    println("Choose 1 for Yes and 2 for No.")
    choice = readLine()?.toIntOrNull() ?: 0
    while(choice!=1 && choice!=2){
        println("Invalid input. Choose 1 for Yes and 2 for No.")
        choice = readLine()?.toIntOrNull() ?: 0
    }
    if (choice==2) {
        println("Nice talking to you. Mom's calling me to help her with the dishes. See you again later.")
        exitProcess(0)
    }
    else
    {
        choice=java.util.Random().nextInt(6)+1
        when(choice){
            1->student()
            2->itEng()
            3->dog()
            4->maids()
            5->oldMan()
            6->medical()
        }

    }
}

fun student(){
    println("You are a student studying at a university. Student life has gone topsy-turvy due to the pandemic. Online classes start with a smile and end with a cracked network. You have no clue when classes will resume. There is no surety of exams yet assignments and projects never cease to exist. What you are waiting for is a chance of redemption. Either a circular saying no school, or school starts! You are bored.")
    println("You wake up one morning to your best friend's call. Holiday means party and fun. Your friend invites you to spend some quality time with them.")
    println("What do you do? Type in only numbers.")
    println("1. You dress up in your good clothes and go to meet your friend")
    println("2. You refuse and suggest to have a video call or virtual movie party")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
            food()
        }
        2-> {
            score+=150
            movie()
        }
    }
}

fun itEng(){
    println("You have been working as an IT Engineer away from your home. This lockdown has made things tougher for you. You felt it would be better if you could wake up late but the work from home trend messed up your schedule too.")
    println("Away from home, you feel stranded. The only relief is the roof above your head. You miss mom's food and dad's love.You wish to go home.")
    println("What do you do? Type in only numbers.")
    println("1. Sneak through borders and illegally go home.")
    println("2. You get a flight or train and go to your hometown")
    println("3. You wait where you are till the situation is better.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1, 2-> {
            score-=100
            quarantine()
        }
        3-> {
            score+=150
            food()
        }
    }
}

fun dog(){
    println("You are a little puppy who is the apple of the eye of every family member. You are the princess and the prince to the young one. At this time, when people abandon their pets, your family is there for you.")
    println("Your master is the best. They've got you a toy. The softy crunchy one. You wanna lick it. Bite it. Claim it. But it's unwashed.")
    println("What do you do? Type in only numbers.")
    println("1. Pounce on it. Who cares its dirty!")
    println("2. Wait for your master to wash it and give you.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
            poodle()
        }
        2-> {
            score+=150
            owner()
        }
    }
}

fun maids(){
    println("You are an ordinary simple-and-content maid. Even after being a single parent, life was settled. You had enough work to fulfill your and your family's needs. But now, you are jobless.")
    println("You lose all your work and income. Some pay you, others don't. You need to find a new solution.")
    println("What do you do? Type in only numbers.")
    println("1. Roam outside the house and search for work.")
    println("2. Ask the neighbour's educated kid to teach you technology and help you get a new work.")
    println("3. Talk to people and find ways to get out of the misery.")
    println("4. Go around begging.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1,4 -> {
            score-=100
            mask()
        }
        2,3-> {
            score+=150
            cash()
        }
    }
}

fun oldMan(){
    println("Hey, Mr.ChillPill. You are the one who decided to retire soon and spend time with your old friends in the neighbourhood. You led the Laughter Yoga community of your society. Now, there is no laughter, no yoga.")
    println("You wake up and switch on the TV. There's only one channel that is updated - the news channel. Seeing the growing number of cases on TV annoys you.")
    println("What do you do? Type in only numbers.")
    println("1. Break the TV and save the emotional hurt.")
    println("2. Call friends and family and spend time productively.")
    println("3. Try to break the rules and get out of home.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        3 -> {
            score-=100
            walk()
        }
        1,2-> {
            score+=150
            med()
        }
    }
}

fun medical(){
    println("Hey, you Doctor. You are the bravest of all of us. You risk your life everyday to save another. No amount of gratitude would be enough to respect your work.")
    println("You are a saviour. Your health is in your hands too. You need to stop stressing and take enough rest. However, cases seem to be flooding in.")
    println("What do you do? Type in only numbers.")
    println("1. Take rest while you work!")
    println("2. Work extra hours to save people harming your health.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
            outOfMasks()
        }
        2-> {
            score+=150
            sanitize()
        }
    }
}

fun food(){
    println("Opening instagram and whatsapp status hurts you. Those delicious food items are all that you crave. You wish to eat them but you can't. Mom isn't ready to cook either.")
    println("What do you do? Type in only numbers.")
    println("1. You order food online.")
    println("2. You avoid your cravings.")
    println("3. You try to cook by yourself")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
            parlour()
        }
        2,3-> {
            score+=150
            money()
        }
    }
}

fun money(){
    println("Now this was an unnecessary expense. You came here without money. You need money for the next payments.")
    println("What do you do? Type in only numbers.")
    println("1. You do digital transactions.")
    println("2. You go to the bank and withdraw money")
    println("3. You ask your friend for money.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
            hygiene()
        }
        1,3-> {
            score+=150
            electronic()
        }
    }
}

fun movie(){
    println("Captain America used to be your childhood favourite. Not being subscribed to any channel, you are unable to watch it.")
    println("What do you do? Type in only numbers.")
    println("1. You go out and purchase it from the black dealer")
    println("2. You either get a subscription.")
    println("3. You change your plans of watching the movie.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
            parlour()
        }
        2,3-> {
            score+=150
            money()
        }
    }
}

fun parlour(){
    println("The one you had a crush on has agreed to join the virtual call you are gonna be a part of. It's time to look smart and leave a lasting impression. Unfortunately, the lockdown has made you grow hair in a messy way. You really need to get a makeover before the call of your life.")
    println("What do you do? Type in only numbers.")
    println("1. You rush to the parlour open nearby.")
    println("2. You call the parlour or saloon worker home.")
    println("3. You try to groom yourself")
    println("4. You let it go. The one who doesn't accept you at your worst, doesn't deserve you at your best.")
    println("5. You cancel your plan of attending the virtual call.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1, 2-> {
            score-=100
            maid()
        }
        3,4,5-> {
            score+=150
            clothes()
        }
    }
}
fun electronic(){
    println("OUCH! What's worse than having your phone breakdown during the lockdown? What's better is that you don't even have a spare phone currently.")
    println("What do you do? Type in only numbers.")
    println("1. You rush to the electronic shop nearby to repair your phone.")
    println("2. You ask your neighbour for a spare phone.")
    println("3. You try to repair it yourself.")
    println("4. You order a phone online.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1, 4-> {
            score-=100
        }
        2,3-> {
            score+=150
        }
    }
    hospital()
}

fun clothes(){
    println("You have become so board of wearing the same old home clothes, that you started wearing formal wear at home. Discounts are flooding on sites. It's clothes shopping time.")
    println("What do you do? Type in only numbers.")
    println("1. You order a bulk of clothes.")
    println("2. You control your shopping instincts.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun hygiene(){
    println("You just had a transaction.")
    println("What do you do? Type in only numbers.")
    println("1. You go sit on your couch normally and do what you would otherwise do.")
    println("2. You wash up or get sanitized.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun maid(){
    println("There's so much work to do. You are tired of the daily chores now. It's high time, you need a maid to come and clean this mess.")
    println("What do you do? Type in only numbers.")
    println("1. You control your emotions and go work yourself.")
    println("2. You call a part-time mad to work at your home.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
        }
        1-> {
            score+=150
        }
    }
    hospital()
}

fun quarantine(){
    println("You have been asked to take an institutional quarantine of 2 weeks. You are bored in a day. The walls make you wanna end your life. It's annoying - being alone here.")
    println("What do you do? Type in only numbers.")
    println("1. Bribe the authorities and get out of the facility.")
    println("2. Wait till the end of the quarantine period.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1-> {
            score-=100
            book()
        }
        2-> {
            score+=150
            friendsmeet()
        }
    }
}

fun book(){
    println("You are too bored and want a way to pass your time. You start reading books kept at home until you are left with none. You ask your friends to suggest you books and they do. The book you are looking out for is too expensive online. A dealer away from your home is selling it at cheaper rates.")
    println("What do you do? Type in only numbers.")
    println("1. Think of reading it some other time.")
    println("2. Go out buy the book.")
    println("3. Spend more money and buy it online.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
            feed()
        }
        1,3-> {
            score+=150
            inform()
        }
    }
}

fun feed(){
    println("You see a group of poor children knocking your door, asking for food. They seem hungry and malnourished.")
    println("What do you do? Type in only numbers.")
    println("1. You let them in. Make them sit in your home and then offer food.")
    println("2. Give them leftover from your plate.")
    println("3. Find snacks and untouched food which they can eat and give it to them while they stand outside your house.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1, 2-> {
            score-=100
        }
        3-> {
            score+=150
        }
    }
    hospital()
}

fun inform(){
    println("You start feeling sick. You need to take rest. You are staying at home, doesn't mean you stress out and work for money.")
    println("What do you do? Type in only numbers.")
    println("1. You inform your boss and take a leave. Health is first.")
    println("2. You ccontinue to work amidst your sickness.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
        }
        1-> {
            score+=150
        }
    }
    hospital()
}

fun friendsmeet(){
    println("")
    println("What do you do? Type in only numbers.")
    println("1. Think of reading it some other time.")
    println("2. Go out buy the book.")
    println("3. Spend more money and buy it online.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
            hygiene()
        }
        1,3-> {
            score+=150
            drunk()
        }
    }
}

fun drunk(){
    println("Friends, party and beach. What else do you want? They force you to drink alcohol and smoke to enjoy more.")
    println("What do you do? Type in only numbers.")
    println("1. Drink only how much you take and stop.")
    println("2. Get drunk since you needed this.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2-> {
            score-=100
        }
        1-> {
            score+=150
        }
    }
    hospital()
}

fun owner(){
    println("Your owner is back home after going to the pharmacy. Those bread in his hand smell yum. But what smells better is your owner's sweat.")
    println("What do you do? Type in only numbers.")
    println("1. Lick your owner to show affection")
    println("2. Ignore your owner. Rather sleep.")
    println("3. Jump and show excitement. Don't touch owner until he washes.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
            knock()
        }
        2,3-> {
            score+=150
            leftOverFood()
        }
    }
}

fun knock(){
    println("You hear a knock at the door. Your enemy is coming. Doggo to the rescue! Time to safeguard the family.")
    println("What do you do? Type in only numbers.")
    println("1. Bark from your place and show your anger.")
    println("2. Jump on the enemy and maybe bite them.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2 -> {
            score-=100
        }
        1-> {
            score+=150
        }
    }
    dogspecial()
}

fun leftOverFood(){
    println("The baby in the house loves you too. She drops stuff from her plate at times to feed you. But leftovers have her saliva. It's not safe currently.")
    println("What do you do? Type in only numbers.")
    println("1. Won't touch it. Can't risk!")
    println("2. Show the master that his daughter is giving you bad food.")
    println("3. Eat the food. Food shouldn't be disrespected.")
    println("4. Not come near the table during lunch or dinner to avoid cravings.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1,2,4-> {
            score-=100
        }
        3-> {
            score+=150
        }
    }
    dogspecial()
}

fun poodle(){
    println("You stand at your windown and notice your best friend plus crush walk outside your hoeme with your owner. She has no doggo gang following her unlike usual.")
    println("What do you do? Type in only numbers.")
    println("1. Move away. You won't hurt yourself while you lose the opportunity.")
    println("2. Chance to woo her.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2 -> {
            score-=100
            bath()
        }
        1-> {
            score+=150
            anger()
        }
    }
}

fun bath(){
    println("You stepped out of your house, you dirty fellow. You need to clean yourself before coming in contact with food or people.")
    println("What do you do? Type in only numbers.")
    println("1. Show your master that you are dirty and ask them to clean you.")
    println("2. Step under the shower and wait until your master washes you.")
    println("3. Lick yourself. The best way to get cleaned.")
    println("4. Go and sleep. Germs will sleep too.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        3,4 -> {
            score-=100
        }
        1,2-> {
            score+=150
        }
    }
   dogspecial()
}

fun anger(){
    println("They use you to entertain them and shoo you when busy. How is this even fair? You are mad at them. You wanna show your anger. You need more attention than this.")
    println("What do you do? Type in only numbers.")
    println("1. Leave the home when the door is left open and move around.")
    println("2. Hide yourself safely in a clean corner of the home.")
    println("3. Refuse to eat lunch. But eat dinner cuz you dont wanna fall ill.")
    println("4. Bite one of the family members.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1,4 -> {
            score-=100
        }
        2,3-> {
            score+=150
        }
    }
    dogspecial()
}

fun dogspecial(){
    println("Your master got hit by a car. He has been admitted to the hospital due to the criticality of his condition.")
    println("What do you do? Type in only numbers.")
    println("1. You force to  go to the hospital and meet him.")
    println("2. You make the family feel better")
    println("3. You keep getting updates from them instead of going to visit him")
    choice = readLine()?.toIntOrNull() ?: 0
    while(choice>=1 && choice<=3){
        when (choice){
            1-> {
                score-=100
            }
            2,3-> {
                score+=150
            }
        }
        decision()
    }
}

fun mask(){
    println("There's one lady who hasn't yet given you leave. You go to her house for work. Working with masks is very uncomfortable. You feel breathless at times. It tires you to the core.")
    println("What do you do? Type in only numbers.")
    println("1. Wear mask no matter what.")
    println("2. Take small breaks in between your work to breathe. Don't tire yourself totally.")
    println("3. Remove your mask when no one's watching.")
    println("4. Make sure you sneeze with the mask off.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1, 3, 4-> {
            score-=100
            leftOverFood()
        }
        2-> {
            score+=150
            hygiene()
        }
    }
}

fun cash(){
    println("You are running out of cash. The digital methods aren't enough to earn you a meal for your children.")
    println("What do you do? Type in only numbers.")
    println("1. Go to your employer and ask for loan")
    println("2. Find places where food is found for free but ensure that you maintain hygiene.")
    choice = readLine()?.toIntOrNull() ?: 0
    choice = java.util.Random().nextInt(2)+1
    score+=150
    when (choice){
        1-> partyTime()
        2-> unhygieneWork()
    }
}

fun partyTime(){
    println("You are finally better off. You have established a digital presence. Now you don't need to work as a domestic help anymore. Your children demand party.")
    println("What do you do? Type in only numbers.")
    println("1. Take them out on a ride to a famous tourist destination.")
    println("2. Cook their favourite food and give home party.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun unhygieneWork(){
    println("Your employer is asking you to do work with dirty and unhygienic items.")
    println("What do you do? Type in only numbers.")
    println("1. Calmly refuse to do the work.")
    println("2. Do it with a fear of losing your job.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2 -> {
            score-=100
        }
        1-> {
            score+=150
            owner()
        }
    }
    hospital()
}

fun walk(){
    println("This is disheartening. You have called the same people repeatedly. You have done the same tasks. It's time to move on. Life can't go on this way.")
    println("What do you do? Type in only numbers.")
    println("1. Start doing exercise. Do new schedules everyday.")
    println("2. Learn a new activity each week and maybe start a youtube channel.")
    println("3. Let the lockdown go to hell. Get out and party.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        3 -> {
            score-=100
            govtWork()
        }
        1,2-> {
            score+=150
            juice()
        }
    }
}

fun juice(){
    println("You are bored of drinking canned juices. Your family members don't make good juices and you are the worst cook possible. You miss the taste of the lemonade you used to have at Mishra's Corner with your friends.")
    println("What do you do? Type in only numbers.")
    println("1. Ask Mishra to make a lemonade for you and go there!")
    println("2. Try again yourself or ignore the cravings.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun govtWork(){
    println("You just realized that you have a lot of workload. Some of your existing govt works came up. You need to arrange the paperwork. Now you have lots of time to get that done.")
    println("What do you do? Type in only numbers.")
    println("1. Get out and get it done.")
    println("2. Wait for the situation to be better.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun med(){
    println("Your meds are over. You need them. Your going out isn't safe considering your sickness.")
    println("What do you do? Type in only numbers.")
    println("1. Ask someone to get them for you. Make sure you wear masks.")
    println("2. Get out yourself. No corona can harm you.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2 -> {
            score-=100
            hygiene()
        }
        1-> {
            score+=150
            hygiene()
        }
    }
    hospital()
}

fun outOfMasks(){
    println("Masks are out of stock. The hospitals are flooding. You either reuse masks or take a break.")
    println("What do you do? Type in only numbers.")
    println("1. Reuse Masks!")
    println("2. Take a break.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
            quarantineh()
        }
        2-> {
            score+=150
            fixedBreak()
        }
    }
}

fun quarantineh(){
    println("Your mask had an accident tear while you were treating a Covid-19 patient.")
    println("What do you do? Type in only numbers.")
    println("1. Get Quarantined.")
    println("2. Continue Working.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun fixedBreak(){
    println("You had promised your daughter to be home on her birthday. It's her birthday tomorrow. You haven't slept properly for days. You are getting tired.")
    println("What do you do? Type in only numbers.")
    println("1. Take a break and celebrate your daughter's birthday with her.")
    println("2. Avoid her demand due to increasing number of patients..")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}

fun sanitize(){
    println("Your master is the best. They've got you a toy. The softy crunchy one. You wanna lick it. Bite it. Claim it. But it's unwashed.")
    println("What do you do? Type in only numbers.")
    println("1. Pounce on it. Who cares its dirty!")
    println("2. Wait for your master to wash it and give you.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
            sickish()
        }
        2-> {
            score+=150
            family()
        }
    }
}

fun sickish(){
    println("You start shivering out of nowhere. Your body seems hot. But there's no time to rest in front of patients.")
    println("What do you do? Type in only numbers.")
    println("1. Take a leave. You might endanger alot of people due to your carelessness.")
    println("2. Continue working. There is lot of pressure.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        2 -> {
            score-=100
        }
        1-> {
            score+=150
        }
    }
    hospital()
}

fun family(){
    println("Your master is the best. They've got you a toy. The softy crunchy one. You wanna lick it. Bite it. Claim it. But it's unwashed.")
    println("What do you do? Type in only numbers.")
    println("1. Pounce on it. Who cares its dirty!")
    println("2. Wait for your master to wash it and give you.")
    choice = readLine()?.toIntOrNull() ?: 0
    when (choice){
        1 -> {
            score-=100
        }
        2-> {
            score+=150
        }
    }
    hospital()
}


fun hospital(){
    println("Your friend got hit by a car. He has been admitted to the hospital due to the criticality of his condition.")
    println("What do you do? Type in only numbers.")
    println("1. You rush to the hospital and meet him.")
    println("2. You call his parents up and make them feel better")
    println("3. You keep getting updates from them instead of going to visit him")
    choice = readLine()?.toIntOrNull() ?: 0
    while(choice>=1 && choice<=3){
        when (choice){
            1-> {
                score-=100
            }
            2,3-> {
                score+=150
            }
        }
        decision()
    }
}

fun decision(){
    if (score>350) {
        println("You are fit and healthy. There is nothing to worry about. The world needs more people like you! Host online virtual meets and spread awareness about safety! You are the warrior we need to see in all! Take care. Bye.")
        exitProcess(0)
    }
    else{
        println("You are a fruit of your choices. You have been admitted to the hospital due to high fever. Your tests are yet to come. You need to take care and work on making yourself better. Hope you learn from your mistakes and take care of you and your loved ones. Only together can we fight this corona havoc. Get Well Soon. Bye.")
        exitProcess(0)
    }
}
