def converString(s):
    s = s.replace('C#', 'c')
    s = s.replace('D#', 'd')
    s = s.replace('F#', 'f')
    s = s.replace('G#', 'g')
    s = s.replace('A#', 'a')
    return s

def playTime(start, end):
    start_h, start_m = start.split(':')
    end_h, end_m = end.split(':')
    HH = int(end_h) - int(start_h)
    MM = int(end_m) - int(start_m)

    play = 0

    if HH != 0:
        play += 60 * HH

    play += MM
    return play

def solution(m, musicinfos):
    res = []
    m = converString(m)

    for idx, infos in enumerate(musicinfos):
        start, end, music, sheet = infos.split(',')
        total = playTime(start, end)

        if len(m) > total:
            continue

        sheet = converString(sheet)
        sheet = sheet * ((total // len(sheet)) + 1)
        sheet = sheet[:total]

        if m in sheet:
            res.append((total, idx, music))

    if res:
        res.sort(key=lambda x: (-x[0], x[1]))
        return res[0][2]

    return "(None)"