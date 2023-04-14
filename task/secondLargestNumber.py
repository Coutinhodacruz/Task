num_str = input("Enter multiple numbers : ")

num_list = [int(num) for num in num_str.split(",")]

num_list.sort()
second_largest = num_list[-2]


print("The second largest number is:", second_largest)
