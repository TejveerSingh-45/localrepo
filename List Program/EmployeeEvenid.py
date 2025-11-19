n=int(input())
id=list(map(int,input().split()))
even_id=[ x for x in id if x%2==0]
if even_id:
    print(*even_id)
else:
    print(-1)