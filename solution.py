Here is a Python console application that finds the median of two sorted arrays:

```python
def find_median_sorted_arrays(nums1, nums2):
    nums = sorted(nums1 + nums2)
    length = len(nums)
    if length % 2 == 0:
        return (nums[length // 2] + nums[length // 2 - 1]) / 2
    else:
        return nums[length // 2]

def main():
    nums1 = list(map(int, input("Enter the elements of the first sorted array separated by space: ").split()))
    nums2 = list(map(int, input("Enter the elements of the second sorted array separated by space: ").split()))
    print("The median is: ", find_median_sorted_arrays(nums1, nums2))

if __name__ == "__main__":
    main()
```

This console application first asks the user to input the elements of the first and second sorted arrays. It then calculates the median of the combined sorted array and prints it.