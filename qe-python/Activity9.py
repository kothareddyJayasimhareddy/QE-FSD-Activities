list1 = [2,3,43,12,21,23,54,4]
list2 = [3,45,65,78,2,12,32,3]

list3 = [i for i in list1 if i %2==0] + [i for i in list2 if i %2!=0]
# list3 = [i for i in list2 if i %2!=0]

print(list3)