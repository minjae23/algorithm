num=int(input())
n=sorted(list(map(int,input().split())))
k=sorted(list(map(int,input().split())),key=lambda x:-x)
s=0
for i in range(num):
    s +=n[i]*k[i]

print(s)