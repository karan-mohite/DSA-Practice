public class CricketTeam {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 5, 3 };
        int k = 3;
        int maxTeams = calculateMaxTeams(arr, k);
        System.out.print(maxTeams == -1 ? "No team possible" : "Maximum team possible" + maxTeams);
    }

    private static int calculateMaxTeams(int[] arr, int k) {

        int min = 0;
        int max = 10;

        while (min <= max) // mid=5
        {
            int mid = (min + max) / 2;
            if (midTeamsPossible(arr, mid, k)) {
                if (!midTeamsPossible(arr, mid + 1, k)) {
                    return mid;
                } else {
                    min = mid + 1;
                }
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    private static boolean midTeamsPossible(int[] arr, int possibleNumberOfTeams, int playersperTeam) {
        int totalPlayersNeeded = possibleNumberOfTeams * playersperTeam;
        int sum = 0;
        for (int n : arr)
            sum = sum + Math.min(n, possibleNumberOfTeams);

        if (sum >= totalPlayersNeeded) {
            return true;

        } else {
            return false;
        }
    }
}
