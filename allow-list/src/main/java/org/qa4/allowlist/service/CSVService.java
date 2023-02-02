package org.qa4.allowlist.service;

import org.qa4.allowlist.helper.CSVHelper;
import org.qa4.allowlist.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {

