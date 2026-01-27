def play_rps(p1:str, p2:str):
    match (p1.lower(), p2.lower()):
        case (move1, move2) if move1 == move2:
            return "Its a tie!"
        case ("rock", "scissors") | ("paper", "rock") | ("scissors", "paper"):
            return "Player 1 wins"
        case ("rock", "paper") | ("paper", "scissors") | ("scissors", "rock"):
            return "Player 2 wins"

print(play_rps("paper","scissors"))