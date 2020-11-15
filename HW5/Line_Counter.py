import os

def count(file):
    f = open(file, 'r')
    c = 0
    for _ in f:
        c += 1
    f.close()
    print("\tCount: " + str(c))
    return c


total_cnt = 0

for root, dirs, files in os.walk('D:\\pryor\\Downloads\\gamebay_chess_src_0.7\\net.sf.gamebay'):
    for file in files:
        if file.endswith('.java'):
            print(os.path.join(root, file))
            total_cnt += count(os.path.join(root, file))

print()
print(total_cnt)
