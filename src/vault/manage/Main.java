package vault.manage;


public class Main {
    public static void main(String[] args) {

        Vault vault = new Vault();
        VaultManager manager = new VaultManager("Asaad", "Asaad");

        vault.addVaultManager(manager);
        vault.showVaultAdministrator();

        try {
            vault.checkAccess(new Person("Asaad", "Asaad"));
            System.out.println("Access granted.");
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            vault.checkAccess(new Person("Ahmed", "Ahmed"));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        vault.removeVaultManager();
        vault.showVaultAdministrator();
    }
}
