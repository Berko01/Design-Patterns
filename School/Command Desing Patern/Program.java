

public class Program {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();

        ReceiverBank bank1 = new ReceiverBank("Banka 1");
        ReceiverBank bank2 = new ReceiverBank("Banka 2");

        ICommand addBankCommand = new BankAddCommand(bank1);
        ICommand deletBankCommand = new BankDeleteCommand(bank2);

        RecevierSuplier suplier = new RecevierSuplier(1, " Supplier 1");
        RecevierSuplier suplier2 = new RecevierSuplier(2, " Supplier 2");

        SuplierCommand enableSuplierCommand = new EnableSupplierCommand(suplier);
        SuplierCommand disableSuplierCommand = new DisableSupplierCommand(suplier2);

        commandManager.commands.push(addBankCommand);
        commandManager.commands.push(deletBankCommand);
        commandManager.commands.push(enableSuplierCommand);
        commandManager.commands.push(disableSuplierCommand);

        commandManager.executeAll();
    }
}
