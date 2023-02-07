```C#
using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        double median = FindMedianSortedArrays(nums1, nums2);

        Console.WriteLine("The median is: " + median);
    }

    public static double FindMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] nums = new int[nums1.Length + nums2.Length];
        nums1.CopyTo(nums, 0);
        nums2.CopyTo(nums, nums1.Length);
        Array.Sort(nums);

        int half = nums.Length / 2;

        if (nums.Length % 2 == 0)
        {
            return (nums[half - 1] + nums[half]) / 2.0;
        }
        else
        {
            return nums[half];
        }
    }
}
```