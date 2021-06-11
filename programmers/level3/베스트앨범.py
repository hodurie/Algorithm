from collections import defaultdict

def solution(genres, plays):
    answer = []
    genre = defaultdict(int)
    song = defaultdict(lambda : [])

    for idx, g in enumerate(genres):
        genre[g] += plays[idx]
        song[g].append((idx, plays[idx]))

    sort_genre = sorted(genre.items(), key = lambda x : x[1], reverse=True)

    for g, v in sort_genre:
        song[g].sort(key = lambda x : (x[1], -x[0]), reverse=True)
        answer += [idx for idx, play in song[g][:2]]

    return answer