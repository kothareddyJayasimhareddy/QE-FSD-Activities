def play_rps(p1:str, p2:str):
    match (p1.lower(), p2.lower()):
        case (move1, move2) if move1 == move2:
            return "Its a tie!"
        case ("rock", "scissors") | ("paper", "rock") | ("scissors", "paper"):
            return "Player 1 wins"
        case ("rock", "paper") | ("paper", "scissors") | ("scissors", "rock"):
            return "Player 2 wins"



while True:
 p1 = input("Enter p1 Choice: ")
 p2 = input("Enter p2 Choice: ")
 print(play_rps(p1, p2))
 again = input("Do you want to play again(yes/no): ")
 if again!="yes":
    print("Game Over!")
    break
