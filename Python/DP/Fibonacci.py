import time


def fibonacci_recursion(n):
    # recursion
    if n == 1 or n == 2:
        return 1
    else:
        return fibonacci_recursion(n-1) + fibonacci_recursion(n-2)


def fibonacci_dp_1(n):
    a = 1
    b = 1
    c = 0
    for i in range(2, n):
        c = a + b
        a = b
        b = c
    return c


def fibonacci_dp_2(n):
    f = [1, 1]
    for i in range(2, n):
        f.append(f[i - 1] + f[i - 2])
    return f[n-1]


if __name__ == '__main__':
    n = 3
    t1 = time.time()
    r1 = fibonacci_recursion(n)
    t2 = time.time()
    print('dg_time:{:.8f}'.format(t2-t1))
    print("==============")
    t3 = time.time()
    r2 = fibonacci_dp_1(n)
    t4 = time.time()
    print('dp_time:{:.8f}'.format(t4 - t3))
    print("==============")
    t5 = time.time()
    r3 = fibonacci_dp_2(n)
    t6 = time.time()
    print('dp_time:{:.8f}'.format(t4 - t3))
    print("==============")
    print('recursion result:', r1)
    print('dp result:', r2)
    print('dp result:', r3)

"""
Other related problem
Stair case
"""

