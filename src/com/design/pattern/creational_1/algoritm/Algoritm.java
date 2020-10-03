package com.design.pattern.creational_1.algoritm;

public class Algoritm {
    //sorting
    //remove duplicate
    //find missing number
    public static int[] arr = {3, 4, 2, 2, 3, 1, 5, 7};
    //find multiple missing number;
    public static int[] arr2 = {3, 4, 2, 2, 3, 1, 5, 7, 9};

    public static void main(String[] args) {
        int n = arr.length;
        int[] aSort = sortingArr(arr, n);
        System.out.println("sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(aSort[i] + ",");
        }
        System.out.println("\nremove duplicate:");
        int lenNoDup = removeDuplicate(aSort, n);
        //store the uniq element to new array named unique with len=lenNodup and using this array for future use
        int[] unique = new int[lenNoDup];
        int d = 0;
        for (int j = 0; j < lenNoDup; j++) {
            unique[d++] = aSort[j];
            System.out.print(aSort[j] + ",");
        }
        System.out.println("\nthe missing number is: ");
        int missNo = findMissingNo(unique, lenNoDup);
        System.out.println(missNo);

        System.out.println("---------------------------------");

        int l = arr2.length;
        System.out.println("sorting2: ");
        int[] lSort = sortingArr(arr2, l);
        for (int i = 0; i < l; i++) {
            System.out.print(lSort[i] + ",");
        }
        System.out.println("\nremove duplicate2: ");
        int lenNodup2 = removeDuplicate(lSort, l);
        int[] unique2 = new int[lenNodup2];
        int e = 0;
        for (int i = 0; i < lenNodup2; i++) {
            unique2[e++] = lSort[i];
            System.out.print(lSort[i] + ",");
        }
        System.out.println("\nthe missing number are: ");
        findMultipleMissingNo(unique2, 9);
    }

    public static int[] sortingArr(int[] arr, int n) {
        //compare current el with next el
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    //repeadly swapping until all element sit in the right order
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int removeDuplicate(int[] arr, int n) {
        //create temp int array to store uniq el
        int[] temp = new int[n];
        //define variable j for temp array indexing
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            //compare current el with next el if not same then store it to temp array(not include last el)
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        //take last el and store it on j++ index of temp array
        temp[j++] = arr[n - 1];
        for (int k = 0; k < j; k++) {
            //reasign uniq el to original array spesified with index k
            arr[k] = temp[k];
        }
        //return len of uniq number that been store on the original array
        return j;
    }

    public static int findMissingNo(int[] arr, int n) {
        //summarize all the element
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            //substract with their index
            total -= arr[i];
        }
        //return missing number
        return total;
    }

    public static void findMultipleMissingNo(int[] arr, int i) {
        //i is last element of the sorting array
        //create boolean vektor array to mark all the present element
        boolean[] mark = new boolean[i + 1];
        for (int j = 0; j < arr.length; j++) {
            //mark present el to true
            mark[arr[j]] = true;
        }
        for (int k = 1; k < i; k++) {
            if (!mark[k]) {
                //if mark is false sout the index
                System.out.print(k + ",");
            }
        }
    }
}
