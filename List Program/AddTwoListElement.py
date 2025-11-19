# a=[3,4,5,6,7,35]
# b=[4,3,7,4,7,8]
lista=list(map(int,input().split()))
listb=list(map(int,input().split()))
result=[lista+listb for lista,listb in zip(lista,listb)]
print(result)
