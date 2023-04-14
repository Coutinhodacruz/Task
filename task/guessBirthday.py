month = 4
year = 2005

while True:

    guess = int(input("Guess the day of birth (1-30): "))

    if guess == 15:
        print("\nCorrect Guess")
        break
    else:
        print("\nIncorrect Guess")
