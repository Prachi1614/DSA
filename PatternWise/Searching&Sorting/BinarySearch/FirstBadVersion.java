package BinarySearch;

    class VersionControl {
    // Simulating the API
    private int bad;

    public VersionControl(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int totalVersions = 10;
        int firstBad = 4;

        FirstBadVersion obj = new FirstBadVersion(firstBad);
        System.out.println("First bad version is: " + obj.firstBadVersion(totalVersions));
    }
}

