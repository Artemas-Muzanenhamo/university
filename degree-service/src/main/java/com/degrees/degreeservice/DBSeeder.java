package com.degrees.degreeservice;

import com.degrees.degreeservice.domain.Degree;
import com.degrees.degreeservice.repository.DegreeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    private final DegreeRepository degreeRepository;
    private static final String BSC = "BSc";
    private static final String MSC = "MSc";
    private static final String PHD = "PHD";

    public DBSeeder(DegreeRepository degreeRepository) {
        this.degreeRepository = degreeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Degree cs = new Degree(0L,"Computer Science", "Information Technology", Arrays.asList(BSC, MSC, PHD));
        Degree se = new Degree(0L,"Software Engineering", "Information Technology", Arrays.asList(BSC, MSC, PHD));
        Degree geo = new Degree(0L,"Geology","Earth Science", Arrays.asList(BSC, MSC, PHD));
        Degree acc = new Degree(0L,"Accounting", "Bookeeping", Arrays.asList(BSC, MSC, PHD));
        Degree bm = new Degree(0L,"Business Management", "Business", Arrays.asList(BSC, MSC, PHD));
        Degree pm = new Degree(0L,"Pure Mathematics", "Mathematics", Arrays.asList(BSC, MSC, PHD));
        Degree jl = new Degree(0L,"Judicial Law", "Law",  Arrays.asList(PHD));
        Degree law = new Degree(0L,"Law", "Law", Arrays.asList(BSC));
        Degree cl = new Degree(0L,"Criminal Law", "Law",  Arrays.asList(MSC));

        // delete all data before we add new data
        this.degreeRepository.deleteAll();

        List<Degree> degrees = Arrays.asList(cs, se, geo, acc, bm, pm, jl, law, cl);
        // add data to use
        this.degreeRepository.saveAll(degrees);
    }
}
