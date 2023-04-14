def merge_sorted_lists(list1, list2):
    merged_list = []

    number1 = len(list1)
    number2 = len(list2)

    firstList = 0
    secondList = 0

    while firstList < number1 and secondList < number2:
        if list1[firstList] <= list2[secondList]:
            merged_list.append(list1[firstList])
            firstList += 1
        else:
            merged_list.append(list2[secondList])
            secondList += 1

    while firstList < number1:
        merged_list.append(list1[firstList])
        firstList += 1

    while secondList < number2:
        merged_list.append(list2[secondList])
        secondList += 1

    return merged_list


list1 = [1, 3, 5, 7, 9]
list2 = [2, 4, 6, 8, 10]

merged_list = merge_sorted_lists(list1, list2)

print(merged_list)
