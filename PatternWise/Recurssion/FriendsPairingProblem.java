public class FriendsPairingProblem {

    public static int pairingFriends(int n){
        if(n == 1 || n == 2){
            return n;
        }
        
        // int fnm1 = pairingFriends(n - 1);

        // int fnm2 = pairingFriends(n - 2);
        // int pairways = (n - 1)*fnm2;

        // int totways = fnm1 + pairways;
        return pairingFriends(n - 1) + (n - 1)*pairingFriends(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(pairingFriends(3));
    }
}
