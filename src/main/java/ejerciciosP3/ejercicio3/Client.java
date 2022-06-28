package ejerciciosP3.ejercicio3;

public class Client {
    public static void main(String[] args) {

        CompositeAlmacenamiento file_a = new CompositeAlmacenamiento("Patrón_de_Diseño_Composite", "pdf", "A", "Archivo");
        CompositeAlmacenamiento file_b = new CompositeAlmacenamiento("Patrón_de_Diseño_Visitor", "txt", 4, "Archivo");
        CompositeAlmacenamiento file_c = new CompositeAlmacenamiento("Patrón_de_Diseño_Decorator", "docx", "B B B B B", "Archivo");
        CompositeAlmacenamiento file_d = new CompositeAlmacenamiento("Patrón_de_Diseño_Bridge", "tex", "C C C C C C C C C C C C C C C C", "Archivo");
        CompositeAlmacenamiento file_e = new CompositeAlmacenamiento("Patrón_de_Diseño_Proxy", "pdf", 15, "Archivo");
        CompositeAlmacenamiento file_f = new CompositeAlmacenamiento("Patrón_de_Diseño_Adapter", "docx", 20, "Archivo");

        CompositeAlmacenamiento folder_a = new CompositeAlmacenamiento("Patrones 1", "Folder");
        folder_a.add(file_a);
        folder_a.add(file_b);

        CompositeAlmacenamiento folder_b = new CompositeAlmacenamiento("Patrones 2","Folder");
        folder_b.add(file_a);
        folder_b.add(file_b);
        folder_b.add(file_c);

        CompositeAlmacenamiento folder_c = new CompositeAlmacenamiento("Patrones 3","Folder");
        folder_c.add(file_a);
        folder_c.add(file_b);
        folder_c.add(file_c);
        folder_c.add(file_d);
        folder_c.add(file_e);
        folder_c.add(file_f);

        CompositeAlmacenamiento folder_d = new CompositeAlmacenamiento("Patrones 4","Folder");
        folder_d.add(file_d);
        folder_d.add(file_e);
        folder_d.add(file_f);

        CompositeAlmacenamiento folder_e = new CompositeAlmacenamiento("Patrones 5","Folder");
        folder_e.add(file_f);
        folder_e.add(file_a);

        CompositeAlmacenamiento storage_disk_a = new CompositeAlmacenamiento("Disco A", "Unidad De Disco");
        storage_disk_a.add(folder_a);
        storage_disk_a.add(folder_b);
        storage_disk_a.add(folder_c);
        storage_disk_a.add(folder_d);
        storage_disk_a.add(folder_e);

        //1.
        storage_disk_a.countWords();
        storage_disk_a.showWordTotalNumber();
    }
}
