def squareRoot(number):
    sr = float(number/2)
    temp = sr
    if number==1:
        return 1
    elif number==0:
        return 0
    else:
        while ((temp - sr) != 0):
    		temp = sr
    		sr = (temp + (number / temp)) / 2
        return sr

def solution(area):
    # Your code here
    constantArea = area
    count = 0
    li = []
    while(constantArea!=0):
        sqroot = int(area**0.5)
        if((sqroot*sqroot)==area):
            li.append(area)
            constantArea -= area
            area = constantArea
            count += 1
        else:
            area -=1
    return li
x = solution(15)
print (x)