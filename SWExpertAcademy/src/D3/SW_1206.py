for t in range(1, 11):
  n = int(input())
  data = list(map(int, input().split()))
  result = 0
  for i in range(2, n-2):
      around = max([data[i - 2], data[i - 1], data[i + 1], data[i + 2]])
      if(data[i] > around):
          result += data[i] - around

  print(f"#{t} {result}")